package com.xqh.demoshujuku.postmail;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午3:43 2019/3/23
 * @ModifiedBy:
 */
public interface MailService {
    public void sendSimpleMail(String to, String subject, String content);

    public void sendHtmlMail(String to, String subject, String content);

    public void sendAttachmentsMail(String to, String subject, String content, String filePath);

    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
